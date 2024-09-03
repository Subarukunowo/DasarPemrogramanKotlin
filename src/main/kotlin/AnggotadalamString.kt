fun main(args: Array<String>) {
    val s = "Rhinopotamus"
    println(s.startsWith("rhino"))
    println(s.endsWith("tamus"))
    println(s.contains("pot"))
    println(s.contains("lol"))

    //toUppercase() and toLowercase()
    var config = "Fullscreen shadows autosave"
    config = config.toLowerCase()
    println("will the game run in fullscreen?")
    println(config.contains("fullscreen"))
    println("will shadows be turned on?")
    println(config.contains("shadows"))
    println("sound be turned off?")
    println(config.contains("nosound"))
    println("would the player likw to use autosave?")
    println(config.contains("autosave"))

    //replace()
    var strJava = "Java is the best!"
    strJava = strJava.replace("Java","Kotlin")
    println(s)
    println("$strJava is ${strJava.length} character long")

    //substring()
    println("I would not banish all of the internet." .substring(2,7))
    //compareto()
    println("alpha" .compareTo("bravo"))
}