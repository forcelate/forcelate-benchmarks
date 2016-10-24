package com.jedivision.temple.serialization;

import org.nustaq.serialization.FSTConfiguration;
import org.springframework.stereotype.Service;

@Service
public class FstSerializer implements AbstractSerializer {
    private static final FSTConfiguration FST = FSTConfiguration.createDefaultConfiguration();

    @Override
    public byte[] serialize(Object object) throws Exception {
        return FST.asByteArray(object);
    }

    @Override
    public Object deserialize(byte[] bytes, Class<?> type) throws Exception {
        return FST.asObject(bytes);
    }
}
