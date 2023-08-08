Feature: validate the vertexspcial web link

    @cookies
    Scenario:validate the cookies accept Button
      Given User is navigated to 'https://vertexspecial.com/'
      When The cookies Banner popup
     Then user is able to click on accept button

     @Scroll_fun
      Scenario: validate the Scrolldown Functionality
       Given User is navigated to 'https://vertexspecial.com/'
      Then User scroll the side bar


     @contact_Button
     Scenario: validate the contact button  Functionality
       Given User is navigated to 'https://vertexspecial.com/'
       When user scrolldown the website
       Then user will get the contact button

     @footer_Home_link
     Scenario: validate the Home button  Functionality in Footer
        Given User is navigated to 'https://vertexspecial.com/'
        When user scrolldown to footer
        Then user will able to click on About link

       @featured_Projects_Button
    Scenario: validate the FeaturedProjects button  Functionality
    Given User is navigated to 'https://vertexspecial.com/'
    When user scrolldown to featuredProjects
    Then user will able to click on left button

  @featured_Projects_Button_2
  Scenario: validate the FeaturedProjects button  Functionality
    Given User is navigated to 'https://vertexspecial.com/'
    When user scrolldown to featuredProjects
   Then user will able to click on right  button
    @Carousel_testing
    Scenario: validate the FeaturedProjects  Carousel  Functionality
      Given User is navigated to 'https://vertexspecial.com/'
      When user scrolldown to featuredProjects Carousel
#      Then user will able to click on the carousel element
#i am testing  service button hover option  on navbar

  @service
  Scenario: validate the service  button  Functionality
    Given User is navigated to 'https://vertexspecial.com/'
    When user hover on service button
    Then user will able to see all the further options
#    here its for about button on navbar
  @About
  Scenario: validate the About  button  Functionality
   Given User is navigated to 'https://vertexspecial.com/'
    When user click on About button
   Then user will able to see all the further options of about page
#   here its for career button on navbar
  @career
  Scenario: validate the career  button  Functionality
    Given User is navigated to 'https://vertexspecial.com/'
    When user click on career button
    Then user will able to see all the further options of career page
#    to test the iframe i am using spectrum functionality


#  tab switching funcctionality
#  this is from OrangeHRM website

  @tabSwitching
  Scenario:validate the  switch link on HRM home
    Given User is navigated to 'https://opensource-demo.orangehrmlive.com/'
    When user is click on HRM.Inc link
    Then user is navigated to next page and window is switched

    @hower_on_solution
    Scenario:validate the hover functionality
      Given User is navigated to 'https://opensource-demo.orangehrmlive.com/'
      When use is on child window  tab
    Then user is able to hover on solution tab
#spectrum website iframe work
  @iframe
  Scenario: validate the iframe   button  Functionality
    Given User is navigated to 'https://www.spectrum.com/'
    And USER WILL W8
    When user click on chat button
  And user will get the chat window
  Then user can able to minimize and chat with centre

#    file Upload in selenium
  @file_upload
  Scenario:validate the file_uploading in selenium
    Given User is navigated to 'https://www.foundit.in/'
    When User click on Upload file
    And new Window popUp and click on Upload Button
    Then File is upload successfully
#    file Upload uing robot class
  @file_uploading_by_robot_class
  Scenario:Validate the file uploading using robot class
    Given User is navigated to 'https://enhancv.com/resources/resume-checker/'
    When user click on Upload resume Button
    And Get the option of file seletion
    Then user upload file and click on submit button
    






   