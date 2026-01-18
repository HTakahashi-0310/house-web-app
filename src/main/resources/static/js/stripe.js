const stripe = Stripe('pk_test_51SqwZiCpFopljHmxGjynUzof4jpoiy3vifbEDOKWIWJBrj7aA9eACE5dMs3Tv8O1h8XSjbrN6WRRAC1xgUvsYaz600PiV0nRs0');
const paymentButton = document.querySelector('#paymentButton');

paymentButton.addEventListener('click', () => {
	stripe.redirectToCheckout({
		sessionId: sessionId
	})
});