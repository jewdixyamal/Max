package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* renamed from: ova  reason: default package */
public class ova implements Externalizable {
    public pva A0 = null;
    public boolean B0;
    public pva C0 = null;
    public boolean D0;
    public pva E0 = null;
    public boolean F0;
    public pva G0 = null;
    public boolean H0;
    public pva I0 = null;
    public boolean J0;
    public pva K0 = null;
    public boolean L0;
    public pva M0 = null;
    public boolean N0;
    public pva O0 = null;
    public boolean P0;
    public pva Q0 = null;
    public boolean R0;
    public pva S0 = null;
    public String T0 = "";
    public int U0 = 0;
    public String V0 = "";
    public boolean W0;
    public boolean X;
    public String X0 = "";
    public pva Y = null;
    public boolean Y0;
    public boolean Z;
    public String Z0 = "";
    public boolean a;
    public boolean a1;
    public pva b = null;
    public String b1 = "";
    public boolean c;
    public boolean c1;
    public String d1 = "";
    public boolean e1;
    public String f1 = "";
    public boolean g1 = false;
    public final ArrayList h1 = new ArrayList();
    public final ArrayList i1 = new ArrayList();
    public boolean j1 = false;
    public boolean k1;
    public String l1 = "";
    public boolean m1 = false;
    public pva o = null;
    public pva s0 = null;
    public boolean t0;
    public pva u0 = null;
    public boolean v0;
    public pva w0 = null;
    public boolean x0;
    public pva y0 = null;
    public boolean z0;

    public void a(String str) {
        this.T0 = str;
    }

    public void b(String str) {
        this.V0 = str;
    }

    public final void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            pva pva = new pva();
            pva.readExternal(objectInput);
            this.a = true;
            this.b = pva;
        }
        if (objectInput.readBoolean()) {
            pva pva2 = new pva();
            pva2.readExternal(objectInput);
            this.c = true;
            this.o = pva2;
        }
        if (objectInput.readBoolean()) {
            pva pva3 = new pva();
            pva3.readExternal(objectInput);
            this.X = true;
            this.Y = pva3;
        }
        if (objectInput.readBoolean()) {
            pva pva4 = new pva();
            pva4.readExternal(objectInput);
            this.Z = true;
            this.s0 = pva4;
        }
        if (objectInput.readBoolean()) {
            pva pva5 = new pva();
            pva5.readExternal(objectInput);
            this.t0 = true;
            this.u0 = pva5;
        }
        if (objectInput.readBoolean()) {
            pva pva6 = new pva();
            pva6.readExternal(objectInput);
            this.v0 = true;
            this.w0 = pva6;
        }
        if (objectInput.readBoolean()) {
            pva pva7 = new pva();
            pva7.readExternal(objectInput);
            this.x0 = true;
            this.y0 = pva7;
        }
        if (objectInput.readBoolean()) {
            pva pva8 = new pva();
            pva8.readExternal(objectInput);
            this.z0 = true;
            this.A0 = pva8;
        }
        if (objectInput.readBoolean()) {
            pva pva9 = new pva();
            pva9.readExternal(objectInput);
            this.B0 = true;
            this.C0 = pva9;
        }
        if (objectInput.readBoolean()) {
            pva pva10 = new pva();
            pva10.readExternal(objectInput);
            this.D0 = true;
            this.E0 = pva10;
        }
        if (objectInput.readBoolean()) {
            pva pva11 = new pva();
            pva11.readExternal(objectInput);
            this.F0 = true;
            this.G0 = pva11;
        }
        if (objectInput.readBoolean()) {
            pva pva12 = new pva();
            pva12.readExternal(objectInput);
            this.H0 = true;
            this.I0 = pva12;
        }
        if (objectInput.readBoolean()) {
            pva pva13 = new pva();
            pva13.readExternal(objectInput);
            this.J0 = true;
            this.K0 = pva13;
        }
        if (objectInput.readBoolean()) {
            pva pva14 = new pva();
            pva14.readExternal(objectInput);
            this.L0 = true;
            this.M0 = pva14;
        }
        if (objectInput.readBoolean()) {
            pva pva15 = new pva();
            pva15.readExternal(objectInput);
            this.N0 = true;
            this.O0 = pva15;
        }
        if (objectInput.readBoolean()) {
            pva pva16 = new pva();
            pva16.readExternal(objectInput);
            this.P0 = true;
            this.Q0 = pva16;
        }
        if (objectInput.readBoolean()) {
            pva pva17 = new pva();
            pva17.readExternal(objectInput);
            this.R0 = true;
            this.S0 = pva17;
        }
        a(objectInput.readUTF());
        this.U0 = objectInput.readInt();
        b(objectInput.readUTF());
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.W0 = true;
            this.X0 = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.Y0 = true;
            this.Z0 = readUTF2;
        }
        if (objectInput.readBoolean()) {
            String readUTF3 = objectInput.readUTF();
            this.a1 = true;
            this.b1 = readUTF3;
        }
        if (objectInput.readBoolean()) {
            String readUTF4 = objectInput.readUTF();
            this.c1 = true;
            this.d1 = readUTF4;
        }
        if (objectInput.readBoolean()) {
            String readUTF5 = objectInput.readUTF();
            this.e1 = true;
            this.f1 = readUTF5;
        }
        this.g1 = objectInput.readBoolean();
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            mva mva = new mva();
            mva.readExternal(objectInput);
            this.h1.add(mva);
        }
        int readInt2 = objectInput.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            mva mva2 = new mva();
            mva2.readExternal(objectInput);
            this.i1.add(mva2);
        }
        this.j1 = objectInput.readBoolean();
        if (objectInput.readBoolean()) {
            String readUTF6 = objectInput.readUTF();
            this.k1 = true;
            this.l1 = readUTF6;
        }
        this.m1 = objectInput.readBoolean();
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.a);
        if (this.a) {
            this.b.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.c);
        if (this.c) {
            this.o.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.X);
        if (this.X) {
            this.Y.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.Z);
        if (this.Z) {
            this.s0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.t0);
        if (this.t0) {
            this.u0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.v0);
        if (this.v0) {
            this.w0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.x0);
        if (this.x0) {
            this.y0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.z0);
        if (this.z0) {
            this.A0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.B0);
        if (this.B0) {
            this.C0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.D0);
        if (this.D0) {
            this.E0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.F0);
        if (this.F0) {
            this.G0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.H0);
        if (this.H0) {
            this.I0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.J0);
        if (this.J0) {
            this.K0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.L0);
        if (this.L0) {
            this.M0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.N0);
        if (this.N0) {
            this.O0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.P0);
        if (this.P0) {
            this.Q0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.R0);
        if (this.R0) {
            this.S0.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.T0);
        objectOutput.writeInt(this.U0);
        objectOutput.writeUTF(this.V0);
        objectOutput.writeBoolean(this.W0);
        if (this.W0) {
            objectOutput.writeUTF(this.X0);
        }
        objectOutput.writeBoolean(this.Y0);
        if (this.Y0) {
            objectOutput.writeUTF(this.Z0);
        }
        objectOutput.writeBoolean(this.a1);
        if (this.a1) {
            objectOutput.writeUTF(this.b1);
        }
        objectOutput.writeBoolean(this.c1);
        if (this.c1) {
            objectOutput.writeUTF(this.d1);
        }
        objectOutput.writeBoolean(this.e1);
        if (this.e1) {
            objectOutput.writeUTF(this.f1);
        }
        objectOutput.writeBoolean(this.g1);
        ArrayList arrayList = this.h1;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((mva) arrayList.get(i)).writeExternal(objectOutput);
        }
        int size2 = this.i1.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            ((mva) this.i1.get(i2)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.j1);
        objectOutput.writeBoolean(this.k1);
        if (this.k1) {
            objectOutput.writeUTF(this.l1);
        }
        objectOutput.writeBoolean(this.m1);
    }
}
