pluginManagement {
    includeBuild("build-logic")
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven("https://www.jitpack.io")
        maven("https://plugins.gradle.org/m2/")
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://www.jitpack.io")
        maven("https://plugins.gradle.org/m2/")
    }
}
rootProject.name = "mobile-wallet"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
include(":mifospay")

include(":core:data")
include(":core:datastore")
include(":core:designsystem")
include(":core:ui")
include(":core:common")
include(":core:network")
include(":core:network")
include(":core:model")
include(":core:datastore-proto")
include(":core:analytics")

include(":feature:history")
include(":feature:receipt")
include(":feature:faq")
include(":feature:passcode")
include(":feature:auth")
include(":feature:make-transfer")
include(":feature:send-money")
include(":feature:notification")
include(":feature:editpassword")
include(":feature:kyc")
include(":feature:savedcards")
include(":feature:invoices")
include(":feature:invoices")
include(":feature:settings")
include(":feature:profile")
include(":feature:finance")
include(":feature:merchants")
include(":feature:accounts")
include(":feature:standing-instruction")
include(":feature:payments")
include(":feature:request-money")
include(":feature:upi-setup")
include(":feature:qr")
include(":feature:home")
