import jakarta.persistence.MappedSuperclass
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.ZonedDateTime

@MappedSuperclass
abstract class BaseTimeEntity {
    @CreationTimestamp
    val createdAt: ZonedDateTime? = null

    @UpdateTimestamp
    var modifiedAt: ZonedDateTime? = null
        protected set
}