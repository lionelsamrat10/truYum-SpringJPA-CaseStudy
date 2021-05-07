<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link type="text/css" rel="stylesheet" href="./style/style.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet"
	href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
<script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
<title>Cart Empty</title>
</head>

<body>

	<div class="mdl-layout mdl-js-layout mdl-layout--fixed-header">
		<header class="mdl-layout__header">
			<div class="mdl-layout__header-row">
				<!-- Title -->
				<span class="mdl-layout-title">truYum</span>
				<!-- Icon -->
				<img class="mdl-layout-icon logo" src="images/truyum-logo-light.png"></img>
				<!-- Add spacer, to align navigation to the right -->
				<div class="mdl-layout-spacer"></div>
				<!-- Navigation -->
				<nav class="mdl-navigation">
					<a class="mdl-navigation__link" href="/show-menu-list-customer">Menu</a>
					<a class="mdl-navigation__link" href="/cart">Cart</a>
				</nav>
			</div>
		</header>
		<div class="mdl-layout__drawer">
			<span class="mdl-layout-title">Select Role</span>
			<nav class="mdl-navigation">
				<a class="mdl-navigation__link" href="/show-menu-list-admin">Admin</a>
				<a class="mdl-navigation__link" href="/show-menu-list-customer">Customer</a>
			</nav>
		</div>
		<main class="mdl-layout__content">
			<div class="page-content">
				<div class="mdl-grid">
					<div class="mdl-cell mdl-cell--3-col"></div>
					<div class="mdl-cell--6-col cart-empty">
						<caption>
							<h3>Cart</h3>
						</caption>
						<br>
						<br>
						<p>
							No items in cart. Use 'Add to Cart' option in <a
								href="/show-menu-list-customer">Menu Item List</a>.
						</p>

					</div>
					<div class="mdl-cell mdl-cell--3-col"></div>
				</div>
			</div>
		</main>
		<footer class="mdl-mini-footer">
			<div class="mdl-mini-footer__left-section">
				<div class="mdl-logo">Copyright &copy; 2019</div>
			</div>
		</footer>
	</div>

</body>

</html>
