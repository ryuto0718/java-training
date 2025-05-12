The field Wand.power is not visibleJava(33554503)
内容：フィールドのWand.powerが見えない
原因はWandクラスのフィールドでprivate修飾子を使用しているため、ほかのクラスから見えなくなっている。