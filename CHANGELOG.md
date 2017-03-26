# Change Log
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/).

## [Unreleased]
### Added
- TBD.

## [v1.4.0] - 2017-03-25
### Added
- New files in src folder
    - Create 3 new Entity, (Player, Game, Comment)
    - Create 3 new Repository, (Repo for Player, Game, Comment)
    - Create 3 new RESTful web service and return JSON, (Service for Player, Game, Comment)
    - Create 3 new MVC Controller and implement get and post methods, (Controller for Player, Game, Comment)
    - Create 3 new MVC Page and wire it to your Repository, (html page for Player, Game, Comment)
    - Game page has delete function but put is still in development
    - Added welcome page(welcome.html)
    
### Modified
- Changed files in templet folder
    - Modified home.html
    - Modified login.html
    - Modified movie.html 

## [v1.3] - 2017-02-18
### Added
- Answered in README.md
    - 2 Key Features
    - Landing Page details and screenshot
    - User Input Form details and screenshot
- New files in src folder
    - Create an Entity, (src/main/java/edu.infsci2560/models/Movie.java)
    - Create a Repository, (src/main/java/edu.infsci2560/repositories/MovieRepository.java)
    - Create a RESTful web service and return JSON, (src/main/java/edu.infsci2560/services/MovieService.java)
    - Create a MVC Controller and implement get and post methods, (src/main/java/edu.infsci2560/controllers/MovieController.java)
    - Create a MVC Page and wire it to your Repository, (src/main/resources/templates//movie.html)

### Modified
- Modified in README.md
    - What is the proposed name for your Web application?
        Change to "House of Highlight"
- Changed files in src folder
    - Modified FullStackWebApplication, (src/main/java/edu.infsci2560/FullStackWebApplication.java)
    - Modified MvcConfig, (src/main/java/edu.infsci2560/MvcConfig.java)
    - Modified landing page, (src/main/resources/templates//home.html)      
    
## [v1.2] - 2017-01-28
### Added
- Answered in README.md
    - What is the proposed name for your Web application?
    - Who is the target audience for your Web application?
    - What problem is it intended to solve for the target audience?
    - How will it meet the minimum project requirements?
    - Why is your proposed Web application unique or creative beyond simply meeting the minimum requirements?

## [v1.1] - 2017-01-21
### Added
- Cloned, configured, and compiled the scaffold project.
- Configured developer workspace.
- Deployed to Heroku.

[Unreleased]: https://github.com/infsci2560sp17/full-stack-web-yas42/compare/v1.4.0...HEAD
[v1.4.0]: https://github.com/infsci2560sp17/full-stack-web-yas42/compare/v1.3...v1.4.0
[v1.3]: https://github.com/infsci2560sp17/full-stack-web-yas42/compare/v1.2...v1.3
[v1.2]: https://github.com/infsci2560sp17/full-stack-web-yas42/compare/v1.1...v1.2
[v1.1]: https://github.com/infsci2560sp17/full-stack-web-yas42/compare/...v1.1