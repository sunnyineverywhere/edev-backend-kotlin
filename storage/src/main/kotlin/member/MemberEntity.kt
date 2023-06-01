package member

import BaseTimeEntity
import jakarta.persistence.*

@Entity
@Table(name = "member")
class MemberEntity() : BaseTimeEntity()
{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var memberId: Long? = 0L

        @Column
        var email: String? = ""

        @Column
        var name: String? = ""

        @Column
        var profile: String? = ""
}