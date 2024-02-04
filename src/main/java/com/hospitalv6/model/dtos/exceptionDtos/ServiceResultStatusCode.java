package com.hospitalv6.model.dtos.exceptionDtos;

/**
 * Http Hata Kodların sabit olarak tanımlandığı sınıfdır.
 * <p>
 * Bu sınıfta tanımlanan her hata kodu açıklaması dil dosyasında tanımı yapılmalıdır.
 *
 * <p>
 * 1XX -5XX arası reserve olduğu için hata kodları 6XX ile başlamalıdır.
 */

public final class ServiceResultStatusCode {

    private ServiceResultStatusCode() throws IllegalAccessException {
        throw new IllegalAccessException();
    }

    /**
     * İşlemin başarılı olduğunu  ifade eder
     */
    public static final int SUCCESS = 200;

    /**
     * İşlemin başarısız olduğunu  ifade eder
     */
    public static final int ERROR = 500;

    /**
     * Hasta listesinin bulunamadığını ifade eder.
     */
    public static final int PATINETLIST_NOT_FOUND = 600;

    /**
     * Randevu listesinin bulunamadığını ifade eder.
     */
    public static final int APPOINTMENTLIST_NOT_FOUND = 601;


}
