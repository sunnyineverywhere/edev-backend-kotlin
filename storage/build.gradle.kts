tasks.getByName("bootJar") {
    enabled = true;
}

tasks.getByName("jar") {
    enabled = false;
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
}

allOpen {
    annotation("jakarta.persistence.Entity")
    annotation("jakarta.persistence.Embeddable")
    annotation("jakarta.persistence.MappedSuperclass")
}