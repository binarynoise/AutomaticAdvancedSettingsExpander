# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

-dontobfuscate
# -dontpreverify
-allowaccessmodification
#-optimizations !code/simplification/arithmetic

-keepattributes SourceFile, LineNumberTable, Exception, *Annotation*, InnerClasses, EnclosingMethod, Signature

-keepclassmembers, allowoptimization enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

#-assumenosideeffects class android.util.Log {
#    public static boolean isLoggable(java.lang.String, int);
#    public static int d(...);
#    public static int v(...);
#    public static int i(...);
#    public static int w(...);
#    public static int e(...);
#    public static int wtf(...);
#    public static int println(...);
#}

-dontwarn com.google.auto.service.AutoService
