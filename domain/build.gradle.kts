tasks.getByName("bootJar") {
    enabled = false;
}

tasks.getByName("jar") {
    enabled = false;
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
}