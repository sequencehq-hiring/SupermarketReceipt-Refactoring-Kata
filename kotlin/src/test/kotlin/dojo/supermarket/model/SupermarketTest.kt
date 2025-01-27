package dojo.supermarket.model

import org.junit.jupiter.api.Test
import supermarket.model.Product
import supermarket.model.ProductUnit
import supermarket.model.ShoppingCart
import supermarket.model.SpecialOfferType
import supermarket.model.Teller
import kotlin.test.assertEquals

class SupermarketTest {

    @Test
    fun `test ten percent discount`() {
        val catalog = FakeCatalog()

        val toothbrush = Product("toothbrush", ProductUnit.Each)
        catalog.addProduct(toothbrush, 0.99)

        val apples = Product("apples", ProductUnit.Kilo)
        catalog.addProduct(apples, 1.99)

        val teller = Teller(catalog)
        teller.addSpecialOffer(SpecialOfferType.TenPercentDiscount, toothbrush, 10.0)

        val cart = ShoppingCart()
        cart.addItemQuantity(apples, 2.5)

        val receipt = teller.checksOutArticlesFrom(cart)

        assertEquals(4.975, receipt.totalPrice)
        assertEquals(emptyList(), receipt.getDiscounts())
        assertEquals(1, receipt.getItems().size)
        val receiptItem = receipt.getItems()[0]
        assertEquals(apples, receiptItem.product)
        assertEquals(1.99, receiptItem.price)
        assertEquals(2.5 * 1.99, receiptItem.totalPrice)
        assertEquals(2.5, receiptItem.quantity)

    }
}
