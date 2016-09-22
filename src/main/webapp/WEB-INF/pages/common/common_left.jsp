<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- left side start-->
<div class="left-side sticky-left-side">
	<!--logo and iconic logo start-->
	<div class="logo">
		<a href="/statics/index.html"><img src="/statics/images/linkbit.png" width="100px" alt=""></a>
	</div>
	<div class="logo-icon text-center">
		<a href="/statics/index.html"><img src="/statics/images/logo_icon.png" alt=""></a>
	</div>
	<!--logo and iconic logo end-->

	<div class="left-side-inner">

		<!-- visible to small devices only -->
		<div class="visible-xs hidden-sm hidden-md hidden-lg">
			<div class="media logged-user">
				<img alt="" src="/statics/images/photos/user-avatar.png" class="media-object">
				<div class="media-body">
					<h4><a href="#">管理员</a></h4>
					<span>"Hello There..."</span>
				</div>
			</div>
			<h5 class="left-nav-title">账户信息</h5>
			<ul class="nav nav-pills nav-stacked custom-nav">
				<li>
					<a><i class="fa fa-user"></i> <span>个人资料</span></a>
				</li>
				<li>
					<a href="#"><i class="fa fa-cog"></i> <span>系统设置</span></a>
				</li>
				<li>
					<a href="#"><i class="fa fa-sign-out"></i> <span>退出系统</span></a>
				</li>
			</ul>
		</div>

		<!--sidebar nav start-->
		<ul class="nav nav-pills nav-stacked custom-nav">
			<li class="active">
				<a data-url="portal/list"><i class="fa fa-home"></i> <span>我的主页</span></a>
			</li>
			<li class="menu-list">
				<a href="#"><i class="fa fa-laptop"></i> <span>系统设置</span></a>
				<ul class="sub-menu-list">
					<li>
						<a data-url="user/list">用户管理</a>
					</li>
					<li>
						<a href="#">安全审计</a>
					</li>
					<li>
						<a href="#">目录管理</a>
					</li>
					<li>
						<a href="#">日志管理</a>
					</li>
					<li>
						<a href="#">系统监控</a>
					</li>
				</ul>
			</li>
			<li class="menu-list">
				<a href="#"><i class="fa fa-book"></i> <span>规划及成果管理</span></a>
				<ul class="sub-menu-list">
					<li>
						<a href="#"> 资料管理</a>
					</li>
					<li>
						<a href="#"> 查询统计</a>
					</li>
					<li>
						<a href="#">资源分析</a>
					</li>
				</ul>
			</li>
			<li class="menu-list">
				<a href="#"><i class="fa fa-cogs"></i> <span>项目过程监督</span></a>
				<ul class="sub-menu-list">
					<li>
						<a href="#"> 资料管理</a>
					</li>
					<li>
						<a href="#">查询统计</a>
					</li>
					<li>
						<a href="#">过程监控</a>
					</li>
				</ul>
			</li>
			<li class="menu-list">
				<a href="#"><i class="fa fa-envelope"></i> <span>地理信息管理</span></a>
				<ul class="sub-menu-list">
					<li>
						<a href="#">基本gis操作</a>
					</li>
					<li>
						<a href="#">图层管理</a>
					</li>
					<li>
						<a href="#">对象标绘</a>
					</li>
					<li>
						<a href="#">空间分析</a>
					</li>
				</ul>
			</li>
			<li class="menu-list">
				<a href="#"><i class="fa fa-tasks"></i> <span>多维分析</span></a>
				<ul class="sub-menu-list">
					<li>
						<a href="#">切片切换</a>
					</li>
					<li>
						<a href="#">数据钻取</a>
					</li>
					<li>
						<a href="#">对比分析</a>
					</li>
					<li>
						<a href="#">交叉分析</a>
					</li>
				</ul>
			</li>
		</ul>
		<!--sidebar nav end-->

	</div>
</div>
<!-- left side end-->
<script src="/statics/js/jquery-1.10.2.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("a").on("click", function() {
			var linkTo = $(this).data("url");
			if(linkTo) {
				$("#contentContainer").load(linkTo);
			}
		})
	})
</script>