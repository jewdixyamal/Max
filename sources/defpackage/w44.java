package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* renamed from: w44  reason: default package */
public final /* synthetic */ class w44 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater a;
    private volatile /* synthetic */ int installations$volatile;
    private volatile /* synthetic */ long sequenceNumber$volatile;

    static {
        Class<w44> cls = w44.class;
        a = AtomicIntegerFieldUpdater.newUpdater(cls, "installations$volatile");
        AtomicLongFieldUpdater.newUpdater(cls, "sequenceNumber$volatile");
    }
}
