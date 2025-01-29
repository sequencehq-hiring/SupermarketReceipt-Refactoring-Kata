# Supermarket Receipt Kata

This exercise involves a supermarket that needs to generate shopping receipts for its selection of products. The goal is to improve its test cases and add a new feature.

### Context

The supermarket has a catalog with different types of products (rice, apples, milk, toothbrushes, etc).

Each product has a price. The total price of the shopping cart is the sum of all item prices. 

The receipt has:
- A list of items purchased
- A list of discounts applied
- The total price

The supermarket runs special deals, such as:
- Buy two toothbrushes, get one free. Normal toothbrush price is £0.99
- 20% discount on apples, normal price £1.99 per kilo
- 10% discount on rice, normal price £2.49 per bag

These are just examples: the actual special deals change each week.

### Getting Started

1. Clone this repository

2. Open the folder for your desired language in your preferred IDE. For example, open the `./kotlin` folder in Intellij if you're using Kotlin

3. Install dependencies if needed

4. Run the test suite

### Tasks

#### 1) Update the test

Finish implementing the 'ten percent discount' test. You'll need to add a toothbrush to the cart and test that the discount is applied correctly.

#### 2) New feature: discounted bundles

New feature request: we want to introduce a new kind of special offer: bundles. When you buy all the items in a product bundle you get 10% off the total for those items.

Example:
  - Bundle: 1 toothbrush (£0.99) + 1 toothpaste (£1.79).
  - Total price without discount: £0.99 + £1.79 = £2.78.
  - Discount: 10% of £2.78 = £0.28.
  - Final price: £2.78 - £0.28 = £2.50.

Only complete bundles are discounted. For example:
  - If you buy 2 toothbrushes and 1 toothpaste, only 1 toothbrush and 1 toothpaste are discounted.

#### 3) Extension: improve the codebase (refactoring)

Identity code smells and opportunities to improve the code's readability and maintainability. Talk through your ideas and apply the relevant code changes.
