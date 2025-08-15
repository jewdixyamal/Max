package ru.ok.android.externcalls.sdk.id;

import ru.ok.android.externcalls.sdk.api.InternalIdResponse;

public final class IdUtils {
    private IdUtils() {
        throw new AssertionError("utility class");
    }

    public static sk0 resolveInternalRequest(String str, boolean z) {
        rk0 s = tu0.s("vchat.getOkIdByExternalId");
        s.b = kl.c;
        s.b("externalId", str);
        s.c("anonym", z);
        return s.a(InternalIdResponse.PARSER);
    }
}
