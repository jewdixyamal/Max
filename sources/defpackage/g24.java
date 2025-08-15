package defpackage;

import android.graphics.Color;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: g24  reason: default package */
public final class g24 extends Thread {
    public final AtomicInteger X;
    public ij Y;
    public int Z;
    public final kad a;
    public final int b = 30;
    public e24 c;
    public final ConcurrentLinkedQueue o;
    public final ReentrantLock s0;
    public final Condition t0;
    public final ReentrantLock u0;
    public volatile boolean v0;

    public g24(e24 e24, kad kad) {
        this.a = kad;
        this.c = e24;
        this.o = new ConcurrentLinkedQueue();
        this.X = new AtomicInteger(0);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.s0 = reentrantLock;
        this.t0 = reentrantLock.newCondition();
        this.u0 = new ReentrantLock();
    }

    public final void run() {
        byte[] bArr;
        int i;
        int i2;
        float[] fArr;
        ReentrantLock reentrantLock;
        loop0:
        while (true) {
            boolean z = true;
            if (!(!this.v0)) {
                break;
            }
            ReentrantLock reentrantLock2 = this.u0;
            reentrantLock2.lock();
            try {
                e24 e24 = this.c;
                boolean z2 = e24 == null;
                long bufferedAmount = e24 != null ? e24.a.bufferedAmount() : 0;
                if (z2) {
                    break;
                }
                while (true) {
                    if ((!this.v0) && (bufferedAmount >= 8000000 || (this.Y == null && this.o.isEmpty()))) {
                        ReentrantLock reentrantLock3 = this.s0;
                        reentrantLock3.lock();
                        try {
                            this.t0.await(50, TimeUnit.MILLISECONDS);
                            reentrantLock3.unlock();
                            reentrantLock = this.u0;
                            reentrantLock.lock();
                            e24 e242 = this.c;
                            z2 = e242 == null;
                            bufferedAmount = e242 != null ? e242.a.bufferedAmount() : 0;
                            reentrantLock.unlock();
                            continue;
                        } catch (Throwable unused) {
                        }
                        if (z2) {
                            break loop0;
                        }
                    }
                }
                if (!(!this.v0)) {
                    break;
                }
                if (this.Y == null) {
                    ij ijVar = (ij) this.o.poll();
                    this.Y = ijVar;
                    if (ijVar == null) {
                        continue;
                    } else {
                        this.X.decrementAndGet();
                    }
                }
                ij ijVar2 = this.Y;
                if (ijVar2 != null) {
                    int i3 = this.Z;
                    this.Z = i3 + 1;
                    int i4 = ijVar2.b;
                    tu0 tu0 = ijVar2.c;
                    if (ijVar2.a == 1) {
                        boolean z3 = tu0 instanceof ai;
                        if (tu0 instanceof yh) {
                            fArr = null;
                            ((yh) tu0).getClass();
                        } else if (z3) {
                            fArr = new float[0];
                        } else if (tu0 instanceof zh) {
                            throw new IllegalStateException("Internal error AnimojiSendDataPackage");
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        bArr = new byte[((fArr.length * 4) + 10)];
                        ByteBuffer wrap = ByteBuffer.wrap(bArr);
                        byte b2 = z3 ? (byte) 1 : 0;
                        wrap.put((byte) 1);
                        wrap.putShort((short) i3);
                        wrap.putInt(i4);
                        wrap.putShort(0);
                        wrap.put(b2);
                        wrap.order(ByteOrder.LITTLE_ENDIAN);
                        for (float putFloat : fArr) {
                            wrap.putFloat(putFloat);
                        }
                    } else {
                        boolean z4 = tu0 instanceof yh;
                        if (!z4) {
                            if (tu0 instanceof zh) {
                                i = 3;
                            } else if (tu0 instanceof ai) {
                                i = 0;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                            byte[] bArr2 = new byte[(i + 12)];
                            ByteBuffer wrap2 = ByteBuffer.wrap(bArr2);
                            if (z4) {
                                i2 = 0;
                            } else if (tu0 instanceof zh) {
                                i2 = 2;
                            } else if (tu0 instanceof ai) {
                                i2 = 1;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                            wrap2.put((byte) 2);
                            wrap2.putShort((short) i3);
                            wrap2.putInt(i4);
                            wrap2.putInt(0);
                            wrap2.put((byte) i2);
                            wrap2.order(ByteOrder.LITTLE_ENDIAN);
                            if (!z4) {
                                if (tu0 instanceof zh) {
                                    zh zhVar = (zh) tu0;
                                    wrap2.put((byte) Color.red(zhVar.n));
                                    wrap2.put((byte) Color.green(zhVar.n));
                                    wrap2.put((byte) Color.blue(zhVar.n));
                                } else {
                                    tpa.f(tu0, ai.n);
                                }
                                bArr = bArr2;
                            } else {
                                ((yh) tu0).getClass();
                                throw null;
                            }
                        } else {
                            ((yh) tu0).getClass();
                            throw null;
                        }
                    }
                    ReentrantLock reentrantLock4 = this.u0;
                    reentrantLock4.lock();
                    try {
                        if (this.c != null) {
                            z = false;
                        }
                        ((AtomicInteger) this.a.a).addAndGet(bArr.length);
                        e24 e243 = this.c;
                        if (e243 != null) {
                            e243.e(2, bArr);
                        }
                        ((AtomicInteger) this.a.b).incrementAndGet();
                        this.Y = null;
                        reentrantLock4.unlock();
                        if (z) {
                            break;
                        }
                    } catch (Throwable th) {
                        reentrantLock4.unlock();
                        throw th;
                    }
                } else {
                    continue;
                }
            } finally {
                reentrantLock2.unlock();
            }
        }
        this.Y = null;
        this.o.clear();
    }
}
