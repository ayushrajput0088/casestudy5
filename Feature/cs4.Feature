Feature:
	Scenario:
		Given USer register to TestMeApp
		When User for a product like headpjone
		And Try to proceed to payment w/o adding item in cart
		Then deosnt displays item in cart