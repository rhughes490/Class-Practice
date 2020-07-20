public class Calculator {
        private int firstNum;
        private int secondNum;

        public Calculator(int firstNum, int secondNum) {
            this.firstNum = firstNum;
            this.secondNum = secondNum;
        }

        public int add() {
            return this.firstNum + this.secondNum;
        }

        public int subtract() {
            return this.firstNum - this.secondNum;
        }

        public int multiply() {
            return this.firstNum*this.secondNum;
        }

}
