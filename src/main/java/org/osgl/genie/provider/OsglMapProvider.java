package org.osgl.genie.provider;

import org.osgl.util.C;

import javax.inject.Provider;
import java.util.List;

/**
 * Inject {@link java.util.Map} using {@link org.osgl.util.C.Map}
 */
public class OsglMapProvider implements Provider<C.Map<?, ?>> {

    public static final OsglMapProvider INSTANCE = new OsglMapProvider();

    @Override
    public C.Map<?, ?> get() {
        return C.newMap();
    }
}
