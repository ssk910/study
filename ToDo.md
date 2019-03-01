# 수정해야 할 부분

1. (공통) 모든 클래스에서 행동자, 대상자를 interface 메소드의 매개 변수로 할 것.
매개변수만 바꿔서 스킬 시전자, 대상자가 잘 바뀌게.
Weapon처럼 수정.

2.  skill
일단 skill의 decreaseMp를 Impl의 private으로 수정. 
수정한 skill, skillimpl에 따라 자식 클래스 모두 수정.

3. character

4. WeaponType을 Weapon 안으로.
