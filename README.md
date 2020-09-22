# cs434-assign

## Getting start

1. Install Open JDK 8

   ```bash
   $ sudo apt-get update
   $ sudo apt-get install openjdk-8-jdk
   ```

2. Install recent version of sbt

   ```bash
   $ echo "deb https://dl.bintray.com/sbt/debian /" | sudo tee -a /etc/apt/sources.list.d/sbt.list
   $ curl -sL "https://keyserver.ubuntu.com/pks/lookup?op=get&search=0x2EE0EA64E40A89B84B2DF73499E82A75642AC823" | sudo apt-key add
   $ sudo apt-get update
   $ sudo apt-get install sbt
   ```


3. (Optional) Change to JAVA 8

   ```bash
   $ sudo update-alternatives --config java
   ```

   