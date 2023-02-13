<header>
 <nav class="navbar navbar-expand-md navbar-dark"
  style="background-color: #2596be;">
  <div>
   <a href="<%= request.getContextPath() %>/" class="navbar-brand"> HTML Tips</a>
  </div>

  <ul class="navbar-nav navbar-collapse justify-content-end">
   <%if (session.getAttribute("username")!= null){ %>
   <li><a href="<%= request.getContextPath() %>/logout" class="nav-link">Logout</a></li>
   <li><a href="<%= request.getContextPath() %>/tip?target=creation" class="nav-link">Create Tip</a></li>
   <%} else {%>
   
   <%} %>
   
   
  </ul>
 </nav>
</header>