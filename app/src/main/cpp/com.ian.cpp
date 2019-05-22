#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_ian_app_helper_SecretKeyHelper_getBaseUrl(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "https://beta.smartcom.id";
    return env->NewStringUTF(hello.c_str());
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_ian_app_helper_SecretKeyHelper_getApiKey(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "bkm-84ead0945377e9e3313efec91787cbbafd254b0e";
    return env->NewStringUTF(hello.c_str());
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_ian_app_helper_SecretKeyHelper_getEncriptionKey(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "8fa4a5b6af3bac8a";
    return env->NewStringUTF(hello.c_str());
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_ian_app_helper_SecretKeyHelper_getCommunityId(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "4";
    return env->NewStringUTF(hello.c_str());
}