cmake_minimum_required(VERSION 3.3)
project(jni)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

set(SOURCE_FILES
    MacJni.c
    MacJni.h)

add_executable(jni ${SOURCE_FILES})