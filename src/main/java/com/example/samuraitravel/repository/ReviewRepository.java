package com.example.samuraitravel.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samuraitravel.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
    // 宿IDとメールアドレスで特定の1件を取得
    Optional<Review> findByHouseIdAndUserEmail(Integer houseId, String email);

    // 宿IDに紐づくレビューを投稿日降順で取得（自分以外を除外する場合などに備える）
    List<Review> findByHouseIdOrderByCreatedAtDesc(Integer houseId);
    
    // 宿IDに紐づくレビューを投稿日降順で取得し、特定のIDを除外して取得（最大5件）
    List<Review> findTop5ByHouseIdAndIdNotOrderByCreatedAtDesc(Integer houseId, Integer reviewId);

    // 単純に先頭6件を取得
    List<Review> findTop6ByHouseIdOrderByCreatedAtDesc(Integer houseId);
}
