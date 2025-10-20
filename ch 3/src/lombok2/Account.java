package lombok2;
// 2025.10.20

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode // equals(), hashCode()
@AllArgsConstructor // 전체 멤버변수 이용한 생성자
@NoArgsConstructor // 기본 생성자
@Getter
@Setter
@ToString
@Builder
public class Account {
    private String name;
    private String accNo;
    private int balance;

    // 생성자, getter, setter, toString() => 어노테이션 처리
    // eqauls, hashCode
    // Builder
}
