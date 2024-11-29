<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main</title>
</head>
<body>
	<div class="row">
		<div class="">
			<!-- Nav Card -->
			<div class="tab-content" id="nav-tabContent">
				<!-- card one -->
				<div class="tab-pane fade show active" id="nav-home" role="tabpanel"
					aria-labelledby="nav-home-tab">
					<div class="whats-news-caption">
						<c:url var="path" value="/blogdetail" />
						<div class="row">
							<c:forEach var="d" items="${list}">
								<a href="${path}/show/${d.id}" style="text-decoration: none">
									<div class="col-lg-6 col-md-6">
										<div class="single-what-news mb-100">
											<div class="what-img">
												<img src="/Java3_asm/images/${d.image}"
													style="width: 344px; height: 370px;">
											</div>
											<div class="what-cap">
												<span class="color1">${d.id}</span>
												<h4>
													<a href="#">${d.title}</a>
												</h4>
											</div>
										</div>
									</div>
								</a>

							</c:forEach>
						</div>

					</div>
				</div>
				<!-- Card two -->

				<!-- Card three -->

				<!-- card fure -->

				<!-- card Five -->

				<!-- card Six -->
				<div class="tab-pane fade" id="nav-techno" role="tabpanel"
					aria-labelledby="nav-technology">
					<div class="whats-news-caption">
						<div class="row">
							<div class="col-lg-6 col-md-6">
								<div class="single-what-news mb-100">
									<div class="what-img">
										<img src="assets/img/news/whatNews1.jpg" alt="">
									</div>
									<div class="what-cap">
										<span class="color1">Night party</span>
										<h4>
											<a href="#">Welcome To The Best Model Winner Contest</a>
										</h4>
									</div>
								</div>
							</div>
							<div class="col-lg-6 col-md-6">
								<div class="single-what-news mb-100">
									<div class="what-img">
										<img src="assets/img/news/whatNews2.jpg" alt="">
									</div>
									<div class="what-cap">
										<span class="color1">Night party</span>
										<h4>
											<a href="#">Welcome To The Best Model Winner Contest</a>
										</h4>
									</div>
								</div>
							</div>
							<div class="col-lg-6 col-md-6">
								<div class="single-what-news mb-100">
									<div class="what-img">
										<img src="assets/img/news/whatNews3.jpg" alt="">
									</div>
									<div class="what-cap">
										<span class="color1">Night party</span>
										<h4>
											<a href="#">Welcome To The Best Model Winner Contest</a>
										</h4>
									</div>
								</div>
							</div>
							<div class="col-lg-6 col-md-6">
								<div class="single-what-news mb-100">
									<div class="what-img">
										<img src="assets/img/news/whatNews4.jpg" alt="">
									</div>
									<div class="what-cap">
										<span class="color1">Night party</span>
										<h4>
											<a href="#">Welcome To The Best Model Winner Contest</a>
										</h4>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- End Nav Card -->
		</div>
		
	</div>
</body>
</html>