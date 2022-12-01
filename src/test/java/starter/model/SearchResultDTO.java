package starter.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class SearchResultDTO {

    private final String provider;
    private final String title;
    private final String url;
    private final String brand;
    private final BigDecimal price;
    private final String unit;
    private final boolean isPromo;
    private final String promoDetails;
    private final String image;

    public SearchResultDTO(@JsonProperty("provider") String provider,
                           @JsonProperty("title") String title,
                           @JsonProperty("url") String url,
                           @JsonProperty("brand") String brand,
                           @JsonProperty("price") BigDecimal price,
                           @JsonProperty("unit") String unit,
                           @JsonProperty("isPromo") boolean isPromo,
                           @JsonProperty("promoDetails") String promoDetails,
                           @JsonProperty("image") String image) {
        this.provider = provider;
        this.title = title;
        this.url = url;
        this.brand = brand;
        this.price = price;
        this.unit = unit;
        this.isPromo = isPromo;
        this.promoDetails = promoDetails;
        this.image = image;
    }
}


