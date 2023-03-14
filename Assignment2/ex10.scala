//package vector
//import chisel3._
//import chisel3.stage.ChiselStage
//import chisel3.util._
//import chisel3.experimental.{BaseModule}
//object task10 extends App {
//
//
//  trait ModuleIO {
//    def in1: UInt
//    def in2: UInt
//    def out: UInt
//  }
//
//  class Add extends RawModule with ModuleIO {
//    val in1 = IO(Input(UInt(8.W)))
//    val in2 = IO(Input(UInt(8.W)))
//    val out = IO(Output(UInt(8.W)))
//    out := in1 + in2
//  }
//
//  class Sub extends RawModule with ModuleIO {
//    val in1 = IO(Input(UInt(8.W)))
//    val in2 = IO(Input(UInt(8.W)))
//    val out = IO(Output(UInt(8.W)))
//    out := in1 - in2
//  }
//
//  class Top [T <: BaseModule with ModuleIO] (genT_1: => T, genT_2: => T) extends Module {
//    val io = IO(new Bundle{
//      val in1 = Input(UInt(8.W))
//      val in2 = Input(UInt(8.W))
//      val out_1 = Output(UInt(8.W))
//      val out_2 = Output(UInt(8.W))
//
//    })
//    val subModule = Module(genT_1)
//    val addModule = Module(genT_2)
//
//    io.out_1 := subModule.out
//    io.out_2 := addModule.out
//
//    subModule.in1 := io.in1
//    subModule1.in2 := io.in2
//
//    addModule.in1 := io.in1
//    addModule.in2 := io.in2
//
//
//  }
//  println(ChiselStage.emitVerilog(new Top(new Add, new Sub)))
//
//}