package com.fabiankevin.commonutils.serializer;

import com.fabiankevin.commonutils.utils.LocalDateTimeUtil;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;

public final class DateSerializer {

    public static class IsoDateTime extends StdSerializer<Date> {
        public IsoDateTime() {
            this(null);
        }

        public IsoDateTime(Class<Date> t) {
            super(t);
        }

        @Override
        public void serialize(Date value, JsonGenerator gen, SerializerProvider arg2) throws IOException {
            if (Objects.nonNull(value)) {
                gen.writeString(LocalDateTimeUtil.toLocalDateTime(value).format(DateTimeFormatter.ISO_DATE_TIME));
            } else {
                gen.writeNull();
            }
        }
    }

    public static class IsoDate extends StdSerializer<Date> {
        public IsoDate() {
            this(null);
        }

        public IsoDate(Class<Date> t) {
            super(t);
        }

        @Override
        public void serialize(Date value, JsonGenerator gen, SerializerProvider arg2) throws IOException {
            if (Objects.nonNull(value)) {
                gen.writeString(LocalDateTimeUtil.toLocalDateTime(value).format(DateTimeFormatter.ISO_DATE));
            }
        }
    }
}