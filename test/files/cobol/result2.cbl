        hier kommt irgendein Quatsch
        bla 
        MOVE a TO C
        blub
      
      
      if user-id in session-context = "MOCKUSR" then
      *****************************************************************
      * Mocked call: ksbu501-call                                         
      *****************************************************************
      *
       move 
          0
         to 
          ksy-up-rc in ste-para     
      *
       move 
          "TESTA"
         to 
          ksbc501     
      *
       move 
          "A und B"
         to 
          someverylongstring in my-personal-dataStructe in
          some-other-level     

      *---------------------------------------------------------------*
       else
        call KSYUPNAM using KSBC501
                                             KKTW001
                                             KSY-UP-RC
                
       end-if
        Exit
        .
