<header>
 <nav class="navbar navbar-expand-md navbar-dark"
  style="background-color: #2596be;">
  <div>
   <a href="<%= request.getContextPath() %>/home.jps" class="navbar-brand"> HTML Tips</a>
  </div>

  <ul class="navbar-nav navbar-collapse justify-content-end">
	<li><a href="<%= request.getContextPath() %>/home.jps" class="nav-link">Logout</a></li>
   	<li><a href="<%= request.getContextPath() %>/register.jsp" class="nav-link">Register</a></li>
   	<li><a href="<%= request.getContextPath() %>/login.jsp" class="nav-link">Login</a></li>
   	<li><a href="<%= request.getContextPath() %>/tipCreation.jsp" class="nav-link">Create Tip</a></li>
  </ul>
 </nav>
</header>