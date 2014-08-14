       if user-id in session-context = "MOCKUSR" then
      *****************************************************************
      * Mocked call: <callId>                                         
      *****************************************************************
<assignmentList: {assignment |
      *
       move 
          <assignment.source>
         to 
          <assignment.target>     
   }>
      *---------------------------------------------------------------*
       else
          <callStatement>
       end-if