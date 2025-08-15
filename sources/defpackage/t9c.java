package defpackage;

import java.io.Serializable;

/* renamed from: t9c  reason: default package */
public enum t9c implements Serializable {
    UNKNOWN(0),
    EMOJI(1),
    STICKER(2),
    GIF(3),
    ANIMOJI(4);
    
    public final int a;

    /* access modifiers changed from: public */
    t9c(int i) {
        this.a = i;
    }
}
