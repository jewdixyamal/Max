package ru.ok.android.externcalls.sdk.id.peer;

import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/id/peer/PeerIdGenerator;", "", "()V", "generatePeerId", "", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PeerIdGenerator {
    private static final Companion Companion = new Companion((z84) null);
    private static final long MAX_JS_SAFE_LONG = 9007199254740991L;
    private static final long MIN_JS_SAFE_LONG = -9007199254740991L;
    private static final uv7 PEER_ID_RANGE = new uv7(MIN_JS_SAFE_LONG, MAX_JS_SAFE_LONG);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/id/peer/PeerIdGenerator$Companion;", "", "<init>", "()V", "", "MAX_JS_SAFE_LONG", "J", "MIN_JS_SAFE_LONG", "Luv7;", "PEER_ID_RANGE", "Luv7;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(z84 z84) {
            this();
        }
    }

    public final long generatePeerId() {
        uv7 uv7 = PEER_ID_RANGE;
        m4c m4c = n4c.a;
        try {
            if (!uv7.isEmpty()) {
                long j = uv7.b;
                int i = (j > Long.MAX_VALUE ? 1 : (j == Long.MAX_VALUE ? 0 : -1));
                long j2 = uv7.a;
                return i < 0 ? m4c.j(j2, j + 1) : j2 > Long.MIN_VALUE ? m4c.j(j2 - 1, j) + 1 : m4c.h();
            }
            throw new IllegalArgumentException("Cannot get random in empty range: " + uv7);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
