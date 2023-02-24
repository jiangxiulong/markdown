# brew install tomcat
If you need to have openjdk first in your PATH, run:
  echo 'export PATH="/usr/local/opt/openjdk/bin:$PATH"' >> ~/.zshrc

For compilers to find openjdk you may need to set:
  export CPPFLAGS="-I/usr/local/opt/openjdk/include"

To have launchd start tomcat now and restart at login:
  brew services start tomcat
Or, if you don't want/need a background service you can just run:
  catalina run

# brew install maven
/usr/local/Cellar/maven/3.6.3_1
/usr/local/opt/maven@3.6

# jdk8
brew install --cask adoptopenjdk/openjdk/adoptopenjdk8
echo 'export PATH="/usr/local/opt/openjdk/bin:$PATH"' >> ~/.zshrc

# mq
brew install rabbitmq
To have launchd start rabbitmq now and restart at login:
  brew services start rabbitmq
Or, if you don't want/need a background service you can just run:
  rabbitmq-server
==> Summary
🍺  /usr/local/Cellar/rabbitmq/3.8.14: 114 files, 23.6MB, built in 7 seconds
==> Caveats
==> erlang
Man pages can be found in:
  /usr/local/opt/erlang/lib/erlang/man

Access them with `erl -man`, or add this directory to MANPATH.
==> rabbitmq
Management Plugin enabled by default at http://localhost:15672

To have launchd start rabbitmq now and restart at login:
  brew services start rabbitmq
Or, if you don't want/need a background service you can just run:
  rabbitmq-server


# mongodb
brew tap mongodb/brew
brew install mongodb-community

To have launchd start mongodb/brew/mongodb-community now and restart at login:
  brew services start mongodb/brew/mongodb-community
Or, if you don't want/need a background service you can just run:
  mongod --config /usr/local/etc/mongod.conf
==> Summary
🍺  /usr/local/Cellar/mongodb-community/4.4.5: 11 files, 157.3MB, built in 5 seconds
==> Caveats
==> mongodb-community
To have launchd start mongodb/brew/mongodb-community now and restart at login:
  brew services start mongodb/brew/mongodb-community
Or, if you don't want/need a background service you can just run:
  mongod --config /usr/local/etc/mongod.conf

brew services start mongodb-community



To restart redis after an upgrade:
  brew services restart redis
Or, if you don't want/need a background service you can just run:
  /opt/homebrew/opt/redis/bin/redis-server /opt/homebrew/etc/redis.conf
==> Summary
🍺  /opt/homebrew/Cellar/redis/7.0.7: 14 files, 2.7MB
==> Running `brew cleanup redis`...
Disable this behaviour by setting HOMEBREW_NO_INSTALL_CLEANUP.
Hide these hints with HOMEBREW_NO_ENV_HINTS (see `man brew`).
==> `brew cleanup` has not been run in the last 30 days, running now...
Disable this behaviour by setting HOMEBREW_NO_INSTALL_CLEANUP.