# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable
#
## If you keep the line number information, uncomment this to
## hide the original source file name.
#-renamesourcefileattribute SourceFile
#
#-printconfiguration "build/outputs/mapping/configuration.txt"
#
#-keepclassmembers class * extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite {
#  <fields>;
#}
#
#-dontwarn org.conscrypt.ConscryptHostnameVerifier
#-dontwarn java.lang.instrument.ClassFileTransformer
#
## Kotlin
#-keepclassmembers class **$WhenMappings {
#    <fields>;
#}
#-keep class kotlin.Metadata { *; }
#-keepclassmembers class kotlin.Metadata {
#    public <methods>;
#}
#
#-keepattributes *Annotation*, InnerClasses
#-dontnote kotlinx.serialization.SerializationKt
#
#-keepnames class com.google.android.gms.maps.SupportMapFragment
#
#-keep public class * extends java.lang.Exception
#
#-keepnames class androidx.navigation.fragment.NavHostFragment
#
###---------------Begin: proguard configuration for retrofit2  ----------
## Retrofit does reflection on generic parameters. InnerClasses is required to use Signature and
## EnclosingMethod is required to use InnerClasses.
#-keepattributes Signature, InnerClasses, EnclosingMethod
#
## Retrofit does reflection on method and parameter annotations.
#-keepattributes RuntimeVisibleAnnotations, RuntimeVisibleParameterAnnotations
#
## Ignore annotation used for build tooling.
#-dontwarn org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
#
## Ignore JSR 305 annotations for embedding nullability information.
#-dontwarn javax.annotation.**
#
## Guarded by a NoClassDefFoundError try/catch and only used when on the classpath.
#-dontwarn kotlin.Unit
#
## Kotlin serialization looks up the generated serializer classes through a function on companion
## objects. The companions are looked up reflectively so we need to explicitly keep these functions.
#-keepclasseswithmembers class **.*$Companion {
#    kotlinx.serialization.KSerializer serializer(...);
#}
## If a companion has the serializer function, keep the companion field on the original type so that
## the reflective lookup succeeds.
#-if class **.*$Companion {
#  kotlinx.serialization.KSerializer serializer(...);
#}
#-keepclassmembers class <1>.<2> {
#  <1>.<2>$Companion Companion;
#}
