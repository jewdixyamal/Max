package defpackage;

import android.net.Uri;

/* renamed from: fl  reason: default package */
public interface fl {
    int getPriority() {
        return 16;
    }

    kl getScope();

    Uri getUri();

    boolean shouldGzip() {
        return false;
    }

    boolean shouldPost();

    boolean willWriteParams() {
        return true;
    }

    boolean willWriteSupplyParams() {
        return false;
    }

    void writeParams(kb7 kb7);

    void writeSupplyParams(kb7 kb7) {
    }
}
