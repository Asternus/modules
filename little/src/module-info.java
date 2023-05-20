import others.LisaImpl;

module little {
    requires transitive simmple;
    exports others;
    uses others.Lisa;
    provides others.Lisa with LisaImpl;
}