package com.cryptodailydata.core.constant;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "staticvalues")
public class StaticValuesConstants
{
	private Attachments attachments = new Attachments();
	private String hiddenlist;
	private String currency;
	private String noImage;
	private String akbankLogo;
	private String akbankColor;
	private String yapiKrediLogo;
	private String yapiKrediColor;
	private String isBankLogo;
	private String isBankColor;
	private String garantiLogo;
	private String garantiColor;
	@Data
	public static class Attachments
	{
		private String smallImage;
		private String fullImage;
		private String media;
	}

	@Data
	public static class SearchRelatedProduct
	{
		private String moduleType;
		private String moduleName;
	}

	@Data
	public static class ThankYouPage
	{
		private String customerText;
		private String successText;
		private String thankYouText;
		private String emailText;
	}
}
