object Hello extends App {
    val replaceIn = "8201530"
    val replaced1 = replaceIn.replaceFirst("[201]", "X")
    val replaced2 = replaceIn.replaceAll("[201]", "X")
    println(replaced1)
    println(replaced2)
}
