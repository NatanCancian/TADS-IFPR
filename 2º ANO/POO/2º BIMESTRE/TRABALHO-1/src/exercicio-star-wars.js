var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Personagem = /** @class */ (function () {
    function Personagem(nome, planeta_origem, nivel_energia) {
        this.nome = nome;
        this.planeta_origem = planeta_origem;
        this.nivel_energia = nivel_energia;
    }
    Personagem.prototype.apresentar = function () {
        console.log(" Meu nome \u00E9 ".concat(this.nome, "\n            , sou do planeta ").concat(this.planeta_origem, ", \n            meu poder \u00E9 ").concat(this.nivel_energia));
    };
    Personagem.prototype.usarHabilidade = function () {
        console.log("".concat(this.nome, " usou o poder"));
    };
    return Personagem;
}());
var Jedi = /** @class */ (function (_super) {
    __extends(Jedi, _super);
    function Jedi(nome, planeta_origem, nivel_energia, sabre) {
        var _this = _super.call(this, nome, planeta_origem, nivel_energia) || this;
        _this.corSabre = sabre;
        return _this;
    }
    Jedi.prototype.apresentar = function () {
        console.log("======== Jedi ======== \n            Nome ".concat(this.nome, " \n            Planeta: ").concat(this.planeta_origem, "  \n            Energia: ").concat(this.nivel_energia));
    };
    Jedi.prototype.usarHabilidade = function () {
        console.log("O Jedi ".concat(this.nome, " usou a For\u00E7a para proteger a galaxia \n            Cor do sabre de luz: ").concat(this.corSabre));
    };
    return Jedi;
}(Personagem));
var Sith = /** @class */ (function (_super) {
    __extends(Sith, _super);
    function Sith(nome, planeta, energia, nivelRaiva) {
        var _this = _super.call(this, nome, planeta, energia) || this;
        _this.nivelRaiva = nivelRaiva;
        return _this;
    }
    Sith.prototype.apresentar = function () {
        console.log("======== Sith ======== \n            Nome ".concat(this.nome, " \n            Planeta: ").concat(this.planeta_origem, "  \n            Energia: ").concat(this.nivel_energia));
    };
    Sith.prototype.usarHabilidade = function () {
        console.log("O Sith ".concat(this.nome, " usou o lado sombrio da For\u00E7a.\n                N\u00EDvel de raiva: ").concat(this.nivelRaiva));
    };
    return Sith;
}(Personagem));
var Droide = /** @class */ (function (_super) {
    __extends(Droide, _super);
    function Droide(nome, planeta, energia, funcao) {
        var _this = _super.call(this, nome, planeta, energia) || this;
        _this.funcao = funcao;
        return _this;
    }
    Droide.prototype.apresentar = function () {
        console.log("======== Droide ======== \n       Nome ".concat(this.nome, " \n       Planeta: ").concat(this.planeta_origem, "  \n       Energia: ").concat(this.nivel_energia));
    };
    Droide.prototype.usarHabilidade = function () {
        console.log("O Droide ".concat(this.nome, " executou sua fun\u00E7\u00E3o - ").concat(this.funcao));
    };
    return Droide;
}(Personagem));
var Mandaloriano = /** @class */ (function (_super) {
    __extends(Mandaloriano, _super);
    function Mandaloriano(nome, planeta, energia, armaPrincipal) {
        var _this = _super.call(this, nome, planeta, energia) || this;
        _this.armaPrincipal = armaPrincipal;
        return _this;
    }
    Mandaloriano.prototype.apresentar = function () {
        console.log("======== Mandaloriano ======== \n       Nome ".concat(this.nome, " \n       Planeta: ").concat(this.planeta_origem, "  \n       Energia: ").concat(this.nivel_energia));
    };
    Mandaloriano.prototype.usarHabilidade = function () {
        console.log("O Mandaloriano ".concat(this.nome, " atacou com - ").concat(this.armaPrincipal));
    };
    return Mandaloriano;
}(Personagem));
var jedi1 = new Jedi("Yoda", "Dagobah", 98, "verde");
jedi1.apresentar();
jedi1.usarHabilidade();
var sith1 = new Sith("Lord Palpatine", "Exegol", 98, 100);
sith1.apresentar();
sith1.usarHabilidade();
var droide1 = new Droide("C3PO", "Tatooine", 80, "Protocolo e comunicação");
droide1.apresentar();
droide1.usarHabilidade();
var mandaloriano1 = new Mandaloriano("Boba Fett", "Concord Down", 85, "blaster");
mandaloriano1.apresentar();
mandaloriano1.usarHabilidade();
