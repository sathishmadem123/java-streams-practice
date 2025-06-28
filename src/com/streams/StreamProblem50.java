package com.streams;
/*
Problem 50:
From a list of transactions, group by type and calculate total amount for each type.
Use streams to group and summarize.
*/

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamProblem50 {
    public static void main(String[] args) {
        class Transaction {
            String type;
            double amount;

            Transaction(String type, double amount) {
                this.type = type;
                this.amount = amount;
            }

            public String toString() {
                return type + ": " + amount;
            }
        }

        List<Transaction> transactions = List.of(
                new Transaction("Credit", 100.0),
                new Transaction("Debit", 50.0),
                new Transaction("Credit", 200.0)
        );

        Map<String, Double> lstTransactions = transactions.stream()
                .collect(Collectors.groupingBy(t -> t.type, Collectors.summingDouble(t -> t.amount)));
        System.out.println(lstTransactions);
    }
}

