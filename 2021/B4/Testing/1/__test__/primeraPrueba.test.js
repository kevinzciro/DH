const suma =  require('../primeraPrueba.js');

test('Suma de 2 numeros', ()=> {
    expect(suma(1,2)).toBe(3);
})