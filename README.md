SampleBukkitPlugin
======

This is a sample plug-in for the Bukkit API. It requires a CraftBukkit server.
Bukkit can be found at [http://bukkit.org](http://bukkit.org) 

The goal of this sample plug-in is to provide a base for other plug-ins. This
plugin has a main class named SamplePlugin, one CommandExecutor named
SampleCommandExecutor and one Listener named SampleListener.

This plug-in provides the ability for a login message to be sent to players
connecting. A player with the "sample.message" permissions can set the message.
Ops by default have this permission.

This plugin serves as a basis for the BukkitPlugin-archetype (https://github.com/SagaciousZed/BukkitPlugin-archetype)

Compilation
-----------

This plugin has a Maven 3 pom.xml and uses Maven to compile. Dependencies are 
therefore managed by Maven. You should be able to build it with Maven by running

    mvn package

a jar will be generated in the target folder. For those unfaimilliar with Maven
it is a build system, see http://maven.apache.org/ for more information.
