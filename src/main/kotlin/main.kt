fun main () {
    val fee = 0.75;
    val minAmount = 35 * 100;
    var amount = 500 * 100;
    var result = if (amount >= minAmount)  "transfer fee ${amount/100*fee}"  else "amount $amount < min amount $minAmount";
    println(result);
}