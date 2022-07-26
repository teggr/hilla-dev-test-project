# Robin Tegg Landing Page App

## Create local database

```
CREATE DATABASE landing;
CREATE USER landing_user WITH ENCRTYPED PASWORD 'landing';
ALTER DATABASE landing OWNER TO landing_user;
```

## Flyway CLI

```
flyway clean
```

## Deploy to Heroku

```
heroku plugins:install java
>heroku create --no-remote --region=eu landing-page-app
mvn package -Pproduction
heroku deploy:jar target\landing-page-app-1.0-SNAPSHOT.jar --app teggr-landing-page-app
>heroku logs --tail
heroku config --app=teggr-landing-page-app
heroku config:set --app=teggr-landing-page-app COM_ROBINTEGG_LPA_AUTH_SECRET=$(openssl rand -base64 32)

-- need postgres + sql
heroku addons:create heroku-postgresql -a teggr-landing-page-app
```

## Useful links

- https://hilla.dev/docs/tutorials/in-depth-course/production-build-and-deployment
