# House of Highlight

1. What is the proposed name for your Web application?
    - House of Highlight
2. Who is the target audience for your Web application?
    - NFL fans that wants to watch the replay of their favorite games or highlights of their favorite 
    teams and players.
3. What problem is it intended to solve for the target audience?
    - By developing this website, I want to create a Sports bar kind of environment for all the target 
    audience (NFL fans) to watch their teams and players and have friendly conversation with other 
    fans about football. Other features like team stats or star player stats could be include in this 
    website as well if there’s enough time to do so. 
4. How will it meet the minimum project requirements?
    - All of the games/ players highlights will be accessible to the public. But in order to comment or 
    having a discussion with other users, a login will be required which will be stored in my 
    database. My site will also support OAuth2 authentication for users don’t want to register in my 
    site. The registered user will have the freedom of changing their password, open a new post, modify their old post,
    or delete their old post. All post will also have an upvote/ downvote 
    option. All public data will be accessible through RESTful services. 
5. Why is your proposed Web application unique or creative beyond simply meeting the minimum requirements?
    - The purpose of my site is to bring the fans the one of a kind friendly “Sports bar” environment 
    to the Internet community. I will closely monitor their comment to minimize the negative, harsh 
    posts or comments in my community. If possible, with the game highlight and game stats, I am 
    looking forward to bring the user a whole new way of viewing NFL highlights. 


## Build status

[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web-yas42.svg?branch=master)](https://travis-ci.org/infsci2560sp17/full-stack-web-yas42)

## Web Site

[House of Highlight](https://project2560.herokuapp.com/)

## Changelog

[Changelog](CHANGELOG.md)

## Key Features

* Enables users login
* Enables users to add their highlight film to the database
* Key Feature 3

## Project Details

### Landing Page

Simple Landing Page shows the users what content they will be able to see.[](https://github.com/infsci2560sp17/full-stack-web-yas42/blob/master/Screenshots/landing.JPG)

### User Input Form

My User Input Form have 3 catagories, Film ID, Name and Film Type. Film 1,2,3 are in the system as default, while I added film 4, 5, 6 with success. 
[](https://github.com/infsci2560sp17/full-stack-web-yas42/blob/master/Screenshots/UIF.JPG)

## API

TODO : please provide a description of at least 1 API including a sample of request data and response data in both XML and JSON format.

### API Method 1

    POST photos/:id/tags

#### Parameters

- **id** _(required)_ — The Photo ID to add tags for.
- **tags** _(required)_ — Comma separated tags.

#### Response

A JSON or XMLobject containing the PhotoID and list of tags accepted.

#### Errors

All known errors cause the resource to return HTTP error code header together with a JSON array containing at least 'status' and 'error' keys describing the source of error.

- **404 Not Found** — The photo was not found.

#### Example

##### Request

    POST /v1/photos/123456/tags

##### Body

    tags=cute,puppy


##### JSON Response

```json
{
    "photoId": 123456,
    "tags": ["cute", "puppy"]
}
```

##### XML Response

```xml
<?xml version="1.0" encoding="UTF-8"?>
<PhotoTags>
    <photoId>123456</PhotoId>
        <tags>
            <tag>cute</tag>
            <tag>puppy</tag>
        </tags>
</PhotoTags>
```

## Technologies Used

TODO : List all technologies used in your project

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Thymleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.