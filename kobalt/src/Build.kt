import com.beust.kobalt.*
import com.beust.kobalt.plugin.packaging.*
import com.beust.kobalt.plugin.application.*
import com.beust.kobalt.plugin.kotlin.*

val bs = buildScript {
    repos()
}


val p = project {

    name = "kobalt-example"
    group = "com.example"
    artifactId = name
    version = "0.1"

    sourceDirectories {
        path("src/main/kotlin")
    }

    sourceDirectoriesTest {
        path("src/test/kotlin")
    }

    dependencies {
//        compile("com.beust:jcommander:1.48")
    }

    dependenciesTest {
        compile("org.testng:testng:6.10")

    }

    assemble {
        jar {
        }
    }

    application {
        mainClass = "com.example.MainKt"
    }


}
