from django.db import models

class StockListModel(models.Model):
    """
    Represents a list of stock items in the inventory.

    Fields:
    - goods_code: Unique code for the goods.
    - goods_desc: Description of the goods.
    - goods_qty: Total quantity of goods available.
    - onhand_stock: Quantity of stock available on hand.
    - can_order_stock: Quantity of stock that can be ordered.
    - ordered_stock: Quantity of stock that has been ordered.
    - inspect_stock: Quantity of stock under inspection.
    - hold_stock: Quantity of stock on hold.
    """
    goods_code = models.CharField(max_length=255, verbose_name="Goods Code")
    goods_desc = models.CharField(max_length=255, verbose_name="Goods Description")
    goods_qty = models.BigIntegerField(default=0, verbose_name="Total Qty")
    onhand_stock = models.BigIntegerField(default=0, verbose_name='On Hand Stock')
    can_order_stock = models.BigIntegerField(default=0, verbose_name='Can Order Stock')
    ordered_stock = models.BigIntegerField(default=0, verbose_name='Ordered Stock')
    inspect_stock = models.BigIntegerField(default=0, verbose_name='Inspect Stock')
    hold_stock = models.BigIntegerField(default=0, verbose_name='Holding Stock')
    damage_stock = models.BigIntegerField(default=0, verbose_name='Damage Stock')
    asn_stock = models.BigIntegerField(default=0, verbose_name='ASN Stock')
    dn_stock = models.BigIntegerField(default=0, verbose_name='DN Stock')
    pre_load_stock = models.BigIntegerField(default=0, verbose_name='Pre Load Stock')
    pre_sort_stock = models.BigIntegerField(default=0, verbose_name='Pre Sort Stock')
    sorted_stock = models.BigIntegerField(default=0, verbose_name='Sorted Stock')
    pick_stock = models.BigIntegerField(default=0, verbose_name='Pick Stock')
    picked_stock = models.BigIntegerField(default=0, verbose_name='Picked Stock')
    back_order_stock = models.BigIntegerField(default=0, verbose_name='Back Order Stock')
    supplier = models.CharField(default='', max_length=255, verbose_name='Goods Supplier')
    openid = models.CharField(max_length=255, verbose_name="Openid")
    create_time = models.DateTimeField(auto_now_add=True, verbose_name="Create Time")
    update_time = models.DateTimeField(auto_now=True, blank=True, null=True, verbose_name="Update Time")

    class Meta:
        db_table = 'stocklist'
        verbose_name = 'Stock List'
        verbose_name_plural = "Stock List"
        ordering = ['-id']

class StockBinModel(models.Model):
    """
    Represents a bin within the stock inventory, containing specific goods.

    Fields:
    - bin_name: Name of the bin.
    - goods_code: Unique code for the goods stored in the bin.
    - goods_desc: Description of the goods in the bin.
    - goods_qty: Total quantity of goods in the bin.
    - pick_qty: Quantity of goods picked from the bin.
    - picked_qty: Quantity of goods that have been picked from the bin.
    - bin_size: Size of the bin.
    - bin_property: Property of the bin (e.g., Damage, Inspection, Holding).
    - t_code: Transaction code associated with the bin.
    - openid: Identifier for the user associated with the bin.
    - create_time: Time when the bin was created.
    - update_time: Last time the bin was updated.
    """
    bin_name = models.CharField(max_length=255, verbose_name="Bin Name")
    goods_code = models.CharField(max_length=255, verbose_name="Goods Code")
    goods_desc = models.CharField(max_length=255, verbose_name="Goods Description")
    goods_qty = models.BigIntegerField(default=0, verbose_name="Binstock Qty")
    pick_qty = models.BigIntegerField(default=0, verbose_name="BinPick Qty")
    picked_qty = models.BigIntegerField(default=0, verbose_name="BinPicked Qty")
    bin_size = models.CharField(max_length=255, verbose_name="Bin size")
    bin_property = models.CharField(max_length=255, verbose_name="Bin Property")
    t_code = models.CharField(max_length=255, verbose_name="Transaction Code")
    openid = models.CharField(max_length=255, verbose_name="Openid")
    create_time = models.DateTimeField(auto_now_add=False, verbose_name="Create Time")
    update_time = models.DateTimeField(auto_now=True, blank=True, null=True, verbose_name="Update Time")

    class Meta:
        db_table = 'stockbin'
        verbose_name = 'Stock Bin'
        verbose_name_plural = "Stock Bin"
        ordering = ['-id']
